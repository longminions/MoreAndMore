import React from "react";
import axios from "axios"

class SignInComponent extends React.Component {
    
    constructor(props) {
        super(props);
        this.state = {
          error: null,
          isLoaded: false,
          items: []
        };
      }
    
      componentDidMount() {
        fetch("https://api.example.com/items")
          .then(res => res.json())
          .then(
            (result) => {
              this.setState({
                isLoaded: true,
                items: result.items
              });
            },
            (error) => {
              this.setState({
                isLoaded: true,
                error
              });
            }
          )
      }
    handleLogin(event) {
        console.log(event);
    }
    
   render(){
    return(
    <div>
        <form onSubmit={this.handleLogin}>
            <div className="mb-3">
                <label htmlFor="formInputAcccname" className ="form-label">Example label</label>
                <input type="text" className="form-control" id= "formInputAcccname" placeholder="Nhập số điện thoại của bạn "></input>
            </div>
            <div className="mb-3"> 
                <label htmlFor="formGroupExampleInput2" className = "form-label">Another label</label> 
                <input type="text" className="form-control" id="formGroupExampleInput2" placeholder="Another input placeholder"></input>
            </div>
            <button type="submit" className="btn btn-primary">Submit</button>
        </form>
    </div>
    )
}}
export default SignInComponent;