import {html, LitElement} from 'lit';
import '@vaadin/grid';
import '@vaadin/grid/vaadin-grid-column.js';
import '@vaadin/text-area';
import '@vaadin/button';
import { JsonRpc } from 'jsonrpc';

export class QwcImages extends LitElement {

    jsonRpc = new JsonRpc(this);

    static properties = {
        "_generatedImages": {state: true},
        "_statusInfo": {state: true},
    }

    constructor() {
        super();
        this._generatedImages = [];
    }

    render() {
        return html`
            <h3>Image model</h3>
            ${this._statusInfo}
            <vaadin-text-area id="image-prompt" label="Prompt" style="width:90%"></vaadin-text-area><br/>
            <vaadin-button id="image-submit" @click=${() => this._doGenerate(
                    this.shadowRoot.getElementById('image-prompt').value
            )}>Generate image
            </vaadin-button>
            <br/>
            <h3>Generated images</h3>
            ${this._renderImages()}
        `;
    }

    _doGenerate(prompt) {
        this._statusInfo = html`Generating image...<br/>`;
        this.jsonRpc.generate({prompt: prompt}).then((jsonRpcResponse) => {
            this._statusInfo = html`<qui-alert level="success" showIcon>
                    <span>Image generated successfully.</span>
                </qui-alert>`;
            this._generatedImages = [jsonRpcResponse.result].concat(this._generatedImages)
        }).catch((error) => {
            this._statusInfo = html`
                <qui-alert level="failure" showIcon>
                    <span>${error}</span>
                </qui-alert>`
        });
    }

    _renderImages() {
        return html`
            ${this._generatedImages.map((image) => {
                        return html`
                            <img src="${image.url ? image.url : "data:image/png;base64," + image.base64Data}" 
                                 alt="${image.prompt}" style="max-width: 100%; max-height: 100%;"/><br/>
                            <span>${image.prompt}</span><br/>
                        `;
                    }
            )}
        `;
    }

}

customElements.define('qwc-images', QwcImages);