import React,  {Text, Component } from 'react';
import logo from './logo.svg';
import './App.css';
import {FoodInfo} from "./Components/FoodInfo";
import {Table} from "./Components/Table";
import { Route, BrowserRouter as Router } from "react-router-dom";
import axios from "axios";


class App extends Component() {
  render(){

  
  return (
    

     
  <Router>
      <Route exact path="/" component={FoodInfo} />
    <Route exact path="/view" component={Table} />
  </Router>
  );}
}

export default App;
