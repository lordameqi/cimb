import { Component } from "react";
import PropTypes from 'prop-types';


class HeroName extends Component{
render(){
return <h1>{this.props.name}</h1>

};
}


export default HeroName;