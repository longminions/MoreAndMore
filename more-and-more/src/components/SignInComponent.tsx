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
    
    handleLogin(data) {
      axios.post('/login',{

      });
    };
    
    
   render(){
    return(
    <div>
        <form onSubmit={handleLogin(onsubmit)}>
            <div className="mb-3">
                <label htmlFor="formInputAccname" className ="form-label">Example label</label>
                <input type="text" className="form-control" id= "formInputAccname" placeholder="Nhập số điện thoại của bạn "></input>
            </div>
            <div className="mb-3"> 
                <label htmlFor="formGroupExampleInput2" className = "form-label">Another label</label> 
                <input type="text" className="form-control" id="formInputAccname" placeholder="Another input placeholder"></input>
            </div>
            <button type="submit" className="btn btn-primary">Submit</button>
        </form>
    </div>
    )
}}
export default SignInComponent;

function fetchAPI(data: any) {
  throw new Error("Function not implemented.");
}
