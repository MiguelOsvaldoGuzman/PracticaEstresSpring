<%-- 
    Document   : exito
    Created on : 06-jun-2016, 16:44:18
    Author     : heltonsmith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/bootstrap.js"/></script>

</head>
<body>
    <div class="row">
         <div class="col-md-12" style="background: white;height: 2cm;"></div>
    </div>
    <div class="row" style="color: #80bdff;background-color: gainsboro">
        <div class="col-md-3" style="background: white;height: 2cm;"></div>
        <div class="col-md-6" style="background: white;height: 2cm;">
            <h2>TIENES ESTRES VE POR UNA CAHUA</h2>
        </div>
        <div class="col-md-3" style="background: white;height: 2cm;"></div>
    </div>
    <div class="row">
        <div class="col-md-5" style="background: white;height: 2cm;"></div>
        <div class="col-md-2" style="background: white;height: 2cm;">
            <h2>Repuestas</h2>
        </div>
        <div class="col-md-5" style="background: white;height: 2cm;"></div>
    </div>


    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 1cm;">               
            <p>Te sientes tenso, cansado y con sientes que tu corazon late muy rapido?</p>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>
    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 2cm;">               
            <output class="form-control">
                ${requestScope.respuesta1}
            </output>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>

    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 1cm;">               
            <p>te sientes relajado , y estas alerta a las cosas que pasan a tu alrededor?</p>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>
    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 2cm;">               
            <output class="form-control">
                ${requestScope.respuesta2}
            </output>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>
    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 1cm;">               
            <p>Te sientes agotado, no puedes estar tranquilo, y sientes angustia?</p>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>
    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 2cm;">               
            <output class="form-control">
                ${requestScope.respuesta3}
            </output>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>
    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 1cm;">               
            <p>Te duele la cabeza en este momento?</p>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>
    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 2cm;">               
            <output class="form-control">
                ${requestScope.respuesta4}
            </output>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>
    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 1cm;">               
            <p>Tienes ganas de golpear a alguien?</p>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>
    <div class="row">
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
        <div class="col-md-6" style="background: white;height: 2cm;">               
            <output class="form-control">
                ${requestScope.respuesta5}
            </output>
        </div>
        <div class="col-md-3" style="background: white;height: 1cm;"></div>
    </div>
</body>
</html>
