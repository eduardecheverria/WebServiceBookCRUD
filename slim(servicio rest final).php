<?php
header("Content-type: application/json");
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Headers: Origin, X-Requested-with, Content-Type, Accept");
require 'vendor/autoload.php';
$app = new Slim\App();

$app->post("/getProd", function($request,$response,$args){
    $reqPost = $request->getParsedBody();
    $user = $reqPost["user"];
    $password = $reqPost["password"];
    $categoria = $reqPost["categoria"];
    $respuestacategorias=getProd($user, $password,$categoria);
    $data=json_decode($respuestacategorias['data']);
    //$data=array($categoria => $data);
    $respuestacategorias['data']=$data;

    $nuevaRespuesta['code']=$respuestacategorias['code'];
    $nuevaRespuesta['message']=$respuestacategorias['message'];
    $nuevaRespuesta['status']=$respuestacategorias['status'];
    $file = fopen("log.txt", "w");

    fwrite($file, $password. PHP_EOL);
    
    fclose($file);
    $response->write(json_encode($respuestacategorias,JSON_PRETTY_PRINT));
    return $response->withHeader('Content-Type', 'application/json');
});
$app->post("/getDetails", function($request,$response,$args){
    $reqPost = $request->getParsedBody();
    $user = $reqPost["user"];
    $password = $reqPost["password"];
    $isbn = $reqPost["isbn"];
    $respuestacategorias=getDetails($user, $password,$isbn);
    $data=json_decode($respuestacategorias['data']);
    $respuestacategorias['data']=$data;
    
    $response->write(json_encode($respuestacategorias,JSON_PRETTY_PRINT));
    return $response->withHeader('Content-Type', 'application/json');
});
$app->post("/setProd", function($request,$response,$args){
    $reqPost = $request->getParsedBody();
    $user = $reqPost["user"];
    $password = $reqPost["password"];
    $prodJSON = $reqPost["prodJSON"];
    $respuestacategorias=setProd($user, $password,$prodJSON);
    
    $response->write(json_encode($respuestacategorias,JSON_PRETTY_PRINT));
    return $response->withHeader('Content-Type', 'application/json');
});
$app->post("/updateProd", function($request,$response,$args){
    $reqPost = $request->getParsedBody();
    $user = $reqPost["user"];
    $password = $reqPost["password"];
    $prodJSON = $reqPost["prodJSON"];
    $respuestacategorias=updateProd($user, $password,$prodJSON);
    
    $response->write(json_encode($respuestacategorias,JSON_PRETTY_PRINT));
    return $response->withHeader('Content-Type', 'application/json');
});
$app->post("/updatePass", function($request,$response,$args){
    $reqPost = $request->getParsedBody();
    $user = $reqPost["user"];
    $password = $reqPost["password"];
    $newPass = $reqPost["newPass"];
    $respuestacategorias=updatePassword($user, $password,$newPass);
    
    $response->write(json_encode($respuestacategorias,JSON_PRETTY_PRINT));
    return $response->withHeader('Content-Type', 'application/json');
});
$app->post("/deleteProd", function($request,$response,$args){
    $reqPost = $request->getParsedBody();
    $user = $reqPost["user"];
    $password = $reqPost["password"];
    $isbn = $reqPost["isbn"];
    $respuestacategorias=deleteProd($user, $password,$isbn);
    
    $response->write(json_encode($respuestacategorias,JSON_PRETTY_PRINT));
    return $response->withHeader('Content-Type', 'application/json');
});
$app->post("/login", function($request,$response,$args){
    $reqPost = $request->getParsedBody();
    $user = $reqPost["user"];
    $password = $reqPost["password"];
    $respuestacategorias=login($user, $password);
    $response->write(json_encode($respuestacategorias,JSON_PRETTY_PRINT));
    return $response->withHeader('Content-Type', 'application/json');
});

$app->run();
?>