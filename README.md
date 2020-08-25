# PrediccionCausaSuicidio
Integrantes:

Luis Gerardo Mocha Brito
Carla Isabel Troya Capa

# Proyecto Machine Learning:
Predicción de la Causa de suicidio en base a ciertas variables que debe ingresar el usuario, para dicha predicción hemos usado lo siguiente:

1. Base de Datos de Muerte de defunciones generales del Ecuador, obtenida del Banco de Datos Abiertos que proporciona el Instituto Nacional de Estadísticas y Censos. (http://aplicaciones3.ecuadorencifras.gob.ec/BIINEC-war/index.xhtml;jsessionid=orxIzA0-sqbQJ8Fb9NImkKAc.undefined) Es importante recalcar que la Base de Datos obtenida muestra las defunciones en generales, por lo cual se le aplico un filtro para obtener solo las muertes por suicidio, seguidamente se realizó el análisis exploratorio de los datos.

2. Con la ayuda de la herramienta online Rapidminer Go se obtuvo los algoritmos de machine Learning, donde especifica cuales tienen mayor precisión y con la herramienta PostMan se realizó las pruebas para determinar la efectividad de la predicción.

3. Los algoritmos seleccionados para la predicción fueron: Redes Bayesianas, Aprendizaje Profundo y Árboles de decisión.

4. Para el desarrollo se utilizó Java.

El archivo PredicionesCausaSuicidio.jar permite reconocer la causa de suicidio de un individuo, por lo cual se recibe como parámetros de entrada datos seleccionados en el formulario del archivo.jar y devuelve la posible causa de suicidio.
