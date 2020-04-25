<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Galeria </title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
    
    <link rel="stylesheet" href="css/estilos.css">
    
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
</head>
<body>
   
   <form action="">
       
       <h3>Seleccionar Imagen</h3>
       <input type="text" placeholder="Titulo" class="title-image">
       <img src="images/img2.jpg" class="image-select">
       <input type="button" value="Cargar Imagen" class="load-image">
       <input type="file" class="seleted">
       <input type="button" value="Cargar" class="upload">
       
   </form>
   
   <div class="shape"></div>
   
    <div class="container-gallery">
       <h2>Galeria </h2>
       <input type="button" value="Mostrar Imagenes" class="btn-recient">
        <div class="gallery">
            <figure><h1>imagen</h1><img src="images/img1.jpg"></figure>
            <figure><h1>imagen</h1><img src="images/img2.jpg"></figure>
            <figure><h1>imagen</h1><img src="images/img3.jpg"></figure>
            <figure><h1>imagen</h1><img src="images/img4.jpg"></figure>
            <figure><h1>imagen</h1><img src="images/img5.jpg"></figure>
            <figure><h1>imagen</h1><img src="images/img6.jpg"></figure>
            <figure><h1>imagen</h1><img src="images/img7.jpg"></figure>
            <figure><h1>imagen</h1><img src="images/img8.jpg"></figure>
            <figure><h1>imagen</h1><img src="images/img9.jpg"></figure>
            
        </div>
    </div>
    
    <i class="fas fa-plus btn-show"></i>
    
    <script src="js/jquery.js"></script>
    <script src="js/script.js"></script>
</body>
</html>