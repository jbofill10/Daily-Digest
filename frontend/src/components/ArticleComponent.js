import React from 'react';
import './CSS/ArticleComponent.css'

export default class ArticleComponent extends React.Component{
    constructor(props){
        super();
        this.state = {
        }
    }
    render(){
        return(
            <div className='BoxWrapper'>
                <div className='Box'>
                    <div className='ImageBox'>
                        <img src={require('../reddit.png')} style={{width:'100px', height:'100px', paddingTop:'20px'}}/>
                    </div>
                    <div className='Subreddit'>
                        {this.props.subreddit}                        
                    </div>
                    <div className='Article'>
                        {this.props.title}
                    </div>
                </div>
            </div>
        );
    }

}