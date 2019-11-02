import React from 'react';
import './CSS/ArticleComponent.css'

export default class ArticleComponent extends React.Component{
    constructor(props){
        super(props);
        this.state = {
        }
    }
    render(){
        return(
            <div className='BoxWrapper'>
                <div className='Box'>
                    <div className='ImageBoxWrapper'>
                        <div className='ImageBox'>
                            <img className='RedditIcon' src={require('../reddit.png')}/>
                        </div>           
                    </div>
                    <div className='ArticleContentWrapper'>
                        <div className='SubbredditWrapper'>
                            <a href={`http://www.reddit.com/${this.props.subreddit}`} className='Subreddit'>
                                {this.props.subreddit}                      
                            </a>
                        </div>
        
                        <div className='PostWrapper'>
                            <a href={`http://www.reddit.com/${this.props.urlToRedditPost}`} className='Article'>
                                {this.props.title}
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        );
    }

}