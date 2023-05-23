# Detección Temprana de Cáncer de mama Mediante Uso de Aplicativos IA


### Intregantes:

* Daniela Garcia Romero
* Hayden Esteban Cristancho Pinzon
* Gabriela Castro Santamaria

## Descripción Básica

## Implementación

### Parte 1 Java

Para la primera parte practica se implemento una aplicación donde el usuario pueda cargar el resultado obtenido en su examen para poder ser analizados. Estos datos son: la severidad, el radio y las coordenadas x y y, tomando estos datos, el sistema da como resultado si el tumor es maligno o beningno. Es importante aclarar que en este punto no se hace uso de inteligencia artificial pero se busca recrear gran parte de la idea central del proyecto.


![img.png](img/img.png)

![img_2.png](img/img_2.png)

![img_1.png](img/img_1.png)

* En este caso se ingresaron los datos de un tumor que es benigno.

![img_3.png](img/img_3.png)

* El sistema da un resultado satisfactorio.

![img_4.png](img/img_4.png)

* Para este caso se ingresaron los datos de un tumor que es maligno.

![img_5.png](img/img_5.png)

* El sistema da un resultado satisfactorio.

![img_6.png](img/img_6.png)


![img_9.png](img/img_9.png)


![img_7.png](img/img_7.png)

## Parte 2

* Para la parte de aws, creamos un bucket en donde agregamos las imagenes de la radiografia

![img_8.png](img/img_8.png)

* Ya teniendo las imagenes, creamos el dataset identificando cada una de las fotos con su respectiva etiqueta

![image](https://github.com/danielagar320/ProyectoAREP/assets/90571387/cb8b9199-afca-4e9b-9dff-1e052b1513a5)

* Ya teniendo esto, entrenamos el modelo.

![image](https://github.com/danielagar320/ProyectoAREP/assets/90571387/5d43fdf9-361f-4a9c-937c-2eb89d2b95de)

![image](https://github.com/danielagar320/ProyectoAREP/assets/90571387/4b3635d5-23ba-40d7-8d20-22be8b7a48d1)

* Al finalizar el entrenamiento, podemos usar el modelo cargando las imagenes del bucket e identificando su diagnostico correspondiente.

![image](https://github.com/danielagar320/ProyectoAREP/assets/90571387/a60c7ce0-0439-4da7-91f6-1462cc0c32cb)

![image](https://github.com/danielagar320/ProyectoAREP/assets/90571387/ffd7f497-2b97-430b-acc5-bfb127270675)

![image](https://github.com/danielagar320/ProyectoAREP/assets/90571387/71754a6c-b978-44fe-8d4e-1bfa6f2a33d0)

![image](https://github.com/danielagar320/ProyectoAREP/assets/90571387/a34ff5b0-5292-4523-9be7-f02632686b0e)

## Video demostración

https://youtu.be/A8VgoknZ0NY





