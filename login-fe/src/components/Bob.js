import React, {Component} from 'react';

class Head extends Component {
    render() {
        return (
            <div className="Title">
                <h1>{this.props.title}</h1>
                <h2>By {this.props.author}</h2>
            </div>
        )
    }
}

class Contents extends Component {
    render() {
        return (
            <div className="Contents">
                <p>여자친굴 곁에 두기 위해서 <br/>
                    스펀지송은 자기 바질 찢었네  <br/>
                    하지만 그런 스펀지송을 여자친구는 <br/>
                    떠나가 (찌익) 버렸다네  <br/> 
                </p>
                    　
                <p>
                    그런 짓은 하지 말아야 했는데  <br/> 
                    난 그 사실을 몰랐어  <br/> 
                    이제 와서 후회한들 뭐하리  <br/> 
                    나는 바보가 돼 버린걸  <br/> 
                    　
                    진정한 친굴 사귀기 위해서  <br/> 
                    진실한 마음 하나면 되는 걸  <br/> 
                    나는 도대체 왜 싸구려 웃음으로  <br/> 
                    친굴 사귀려 했던가 바~보~처~럼~ (찌익)  <br/> 
                </p>
                <a href="/hello" target="_blank">스프링 간단 테스트</a>
            </div>
        )
    }
}
export {
    Head, Contents
}