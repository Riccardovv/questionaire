import * as React from "react";
import { useLocation } from "react-router-dom";
import axios from "axios";
import { useState,useEffect } from "react";
import { click } from "@testing-library/user-event/dist/click";

export default function Answers() {
  const paperStyle1 = { padding: "20px 25px", width: 600, margin: "20px auto" };
  const location = useLocation();
  const paperStyle2 = { padding: "20px 25px", margin: "20px auto" };

  const [questions, setQuestions] = useState([]);
  const [answers, setAnswers] = useState([]);
  useEffect(() => {
    loadQuestions();
    loadAnswers();
  }, []);

  const loadQuestions = async () => {
    const result = await axios.get("http://localhost:8080/questions/");
    setQuestions(result.data);
  };


  const loadAnswers = async () => {
    const result = await axios.get("http://localhost:8080/questions/");
    setAnswers(result.data);
  };


  return (
    <>
      <h3>You answered</h3>
     
    </>
  );
}
