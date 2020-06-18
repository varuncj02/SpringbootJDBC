import React,  { useState, useEffect, Component, Text } from "react";

import Avatar from "@material-ui/core/Avatar";
import Button from "@material-ui/core/Button";
import CssBaseline from "@material-ui/core/CssBaseline";
import TextField from "@material-ui/core/TextField";
import { Link } from "react-router-dom";
import Grid from "@material-ui/core/Grid";
import GroupIcon from "@material-ui/icons/Group";
import Typography from "@material-ui/core/Typography";
import { makeStyles } from "@material-ui/core/styles";
import Container from "@material-ui/core/Container";
import axios from "axios";


export default function FoodInfo(){
  const [firstLoad, setLoad] = React.useState(true);

  const [cuisine, setCuisine] = React.useState("");
  const [foodName, setFoodName] = React.useState("");
  const [calories, setCalories] = React.useState(0);
  const [counter, setCounter] = React.useState(0);
  const [rating, setRating] = React.useState(0);


  const handleCuisineChange = event => setCuisine(event.target.value);
  const handleFoodNameChange = event => setFoodName(event.target.value);
  const handleCaloriesChange = event => setCalories(event.target.value);
  const handleCounterChange = event => setCounter(event.target.value);
  const handleRatingChange = event => setRating(event.target.value);


  // Get JSON info from the HTTP 
  async function DisplayFunc(toInput){
    const response = await fetch
  }


}

