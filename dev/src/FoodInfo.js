import React from "react";
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

// Give Code Snippet Credit here 

const useCreatedStyle = makeStyles(theme =>({
    paper: {
        marginTop: theme.spacing(7),
        display: "flex",
        flexDirection: "column",
        alignItems: "center"
      },
      avatar: {
        margin: theme.spacing(1),
        backgroundColor: theme.palette.secondary.main
      },
      form: {
        width: "100%", 
        marginTop: theme.spacing(3)
      },
      submit: {
        margin: theme.spacing(3, 0, 2)
      },
      textField: {
        marginLeft: theme.spacing(1),
        marginRight: theme.spacing(1),
        width: "100%"
      }
}));

export default function FoodInfo() {
    const classes = useCreatedStyle();

    const [firstLoad, setLoad] = React.useState(true);

    const [foodName, setFoodName] = React.useState("");
    const [cuisine, setCuisine] = React.useState("");
    const [calories, setCalories] = React.useState(0);
    const [counter, setCounter] = React.useState(0);
    const [rating, setRating] = React.useState(0);

}