import React from 'react';
import {DataScroller} from 'primereact/datascroller'

export default class ArticleComponent extends React.Component{
    constructor(){
        super();
        this.state = {
            data: [
                "APPLE", "ORANGE", "PINEAPPLE"
            ]
        }
    }
    render(){
        return(
            <DataScroller value={this.state.data} rows={this.state.data.length} buffer={0.9} header={"Your Digest"} inline={true}/>
        );
    }

}