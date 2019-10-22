import React from 'react';
import './CSS/ArticleComponent.css'

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
            <div className='BoxWrapper'>
                <div className='Box'>
                    <div className='ImageBox'/>
                    <div className='Article'>
                        Test
                    </div>
                </div>
            </div>
        );
    }

}