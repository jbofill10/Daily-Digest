import React from 'react';
import HomeButton from './components/HomeButton'
import './App.css';
import ArticleComponent from './components/ArticleComponent';
import 'primereact/resources/themes/nova-light/theme.css';
import 'primereact/resources/primereact.min.css';
import 'primeicons/primeicons.css';

function App() {
  return (
    <div className="App">
      <HomeButton/>
      <ArticleComponent/>
    </div>
  );
}

export default App;
