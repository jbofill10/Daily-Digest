import React from 'react';
import './CSS/HomeButton.css'
import ToolBar from './ToolBar';

function HomeButton() {
  return (
    <div className="HomeButton">
      <div className='HeaderContainer'>
        <ToolBar/>
          <div className='SemiCircle'>
              <div className='The'>
                  The
              </div>
              <div className='DailyDigest'>
                  Daily Digest
              </div>
          </div>
        </div>
    </div>
  );
}

export default HomeButton;
