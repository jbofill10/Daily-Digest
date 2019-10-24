import React from 'react'
import ArticleComponent from '../components/ArticleComponent';
import HomeButton from '../components/HomeButton'
import { thisExpression } from '@babel/types';

export default class HomePage extends React.Component{
    constructor(){
        super();
        this.state = {
            articles: []
        }
    }
    componentDidMount(){
        this.getArticles();
    }

    render(){
        return(
            <div>
                <HomeButton/>
                <div>
                    {this.state.articles.map(data => this.displayArticles(data))}
                </div>
            </div>
        );
    }

    getArticles = () => {
        fetch('/api/reddit/programming').then(response => response.json()).then(data => this.setState({articles : data}))
    }

    displayArticles = (data) => {
        if(this.state.articles.length === 0 || null){
            console.log("Error")
        }else{
            return(
                <ArticleComponent title={data.data.title} subreddit={data.data.subreddit_name_prefixed} urlToRedditPost={data.data.permalink}/>
                )
            }
        }
    }