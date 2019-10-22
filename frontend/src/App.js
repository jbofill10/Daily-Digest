import React from 'react';
import HomeButton from './components/HomeButton'
import './App.css';
import ArticleComponent from './components/ArticleComponent';

function App() {
  return (
    <div className="App">
      <HomeButton/>
      <ArticleComponent/>
      <ArticleComponent/>
      
    </div>
  );
}

export default App;
