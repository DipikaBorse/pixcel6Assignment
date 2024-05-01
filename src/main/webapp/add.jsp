<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add animals</title>
<style>
      .container {
        max-width: 500px;
    width: 100%;
    background: #fff;
    margin: 20px auto;
    box-shadow: 3px 3px 3px rgba(0.424, 0.424, 0.424, 0.424);
    padding: 30px;

    
  }
    

h1{
    color: blue;
}
button {
  background-color: #8199a9;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}

    </style>
</head>
<body>
<form class="container" action=" /saveAnimalData" method="post">
<h1>Add new animals</h1>
Enter Animal Id:-
<br>
<input type="number" name="id"required>
<br>
<br>

Enter Animal Name:-
<br>
<input type="text" name="name"required>
<br>
<br>
Select Category of Animal:-
<br>
<input type="radio" name="Category" vaule="mammals">mammals
<input type="radio" name="Category" vaule="birds" >Birds
<input type="radio" name="Category" vaule="fish">Fish
<input type="radio" name="Category" vaule="reptiles">Reptiles
<input type="radio" name="Category" vaule="amphibians">Amphibians
<br>
<br>
Add images of Animal:-
<br>
<input type="file" accept="image/jpeg" name="Image" required>
<br>
<br>
Description:-
<br>
<textarea  rows="4" cols="50" required name="Description">
</textarea>
<br>
<br>
Life expectancy:-
<br>
<label> </label>
<select required name="life_span">

    <option name="life_span">select</option>
    <option name="life_span">0-2</option>
    <option name="life_span">2-5</option>
    <option name="life_span">5-10</option>
    <option name="life_span">10-40</option>
</select>
<br>
<br>

<button type="submit">Add Animal</button>

</form>
</body>
</html>