import React from 'react';
import './App.css';
import {Head, Contents} from './components/Bob';

function App() {
  return (
    <div className="App">
      <Head title="찢어진 바지" author="스폰지 밥"></Head>
      <Contents></Contents>
    </div>
  );
}

export default App;
