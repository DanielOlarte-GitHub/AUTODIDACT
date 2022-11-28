<h1>Análisis de componentes independientes (ICA) </h1>
Supongamos que estás en una fiesta en casa y estás hablando con una chica guapa. Mientras escuchas, tus oídos están siendo bombardeados por el sonido procedente de las conversaciones que tienen lugar entre los diferentes grupos de personas de la casa y de la música que está sonando a todo volumen en el fondo. Sin embargo, nada de esto te impide concentrarte en lo que dice la chica, ya que el ser humano posee la capacidad innata de diferenciar los sonidos.

Sin embargo, si esto tuviera lugar como parte de la escena de una película, el micrófono que utilizaríamos para grabar la conversación carecería de la capacidad necesaria para diferenciar entre todos los sonidos que se producen en la habitación. Aquí es donde entra en juego el Análisis de Componentes Independientes, o ICA por sus siglas en inglés. El ICA es un método computacional para separar una señal multivariable en sus componentes subyacentes. Con el ICA, podemos extraer el componente deseado (es decir, la conversación entre usted y la chica) de la amalgama de múltiples señales.

<br><br>
<h2> En un nivel alto, el ICA puede desglosarse en los siguientes pasos.</h2>

1. Centrar x restando la media
2. Blanquear x
3. Elija un valor inicial aleatorio para la matriz de desmezcla w
4. Calcular el nuevo valor de w
5. Normalizar w
6. Comprobar si el algoritmo ha convergido y si no lo ha hecho, volver al paso 4
7. Tomar el producto punto de w y x para obtener las señales independientes de la fuente
8. 
<img width="410" alt="image" src="https://user-images.githubusercontent.com/80644486/204178087-9b101e4f-bd11-4c73-9efc-ed854c723da8.png">
<br><br>
<h2> Blanqueamiento </h2>
Antes de aplicar el algoritmo ICA, debemos "blanquear" nuestra señal. Blanquear" una señal determinada significa que la transformamos de forma que se eliminen las posibles correlaciones entre sus componentes (covarianza igual a 0) y la varianza de cada componente sea igual a 1. Otra forma de verlo es que la matriz de covarianza de la señal blanqueada será igual a la matriz identidad.

<img width="671" alt="image" src="https://user-images.githubusercontent.com/80644486/204178214-00ce78ab-2bdb-4621-ac6b-4d1de8cc16d6.png">
<br>
La forma en que se realiza el blanqueo de una señal implica la descomposición de los valores propios de su matriz de covarianza. La ecuación matemática correspondiente puede describirse como sigue.
<img width="351" alt="image" src="https://user-images.githubusercontent.com/80644486/204178282-0f441dfa-d72b-412e-a944-5e5ba35ca34a.png">
Donde D es una matriz diagonal de valores propios (cada lambda es un valor propio de la matriz de covarianza)
<img width="445" alt="image" src="https://user-images.githubusercontent.com/80644486/204178356-51be5616-8d7f-4f63-a194-54d068a291ab.png">

y E es una matriz ortogonal de vectores propios
Una vez que hemos terminado de preprocesar la señal, para cada componente, actualizamos los valores de la matriz de desmezcla w hasta que el algoritmo haya convergido o se haya alcanzado el número máximo de iteraciones. Se considera que la convergencia se alcanza cuando el producto punto de w y su transposición es aproximadamente igual a 1.


<img width="556" alt="image" src="https://user-images.githubusercontent.com/80644486/204178501-fe9eb017-6078-4640-847e-26951f7333df.png">
Donde
<img width="244" alt="image" src="https://user-images.githubusercontent.com/80644486/204178542-880bb5a5-9e1b-403d-bfe1-53b16eafd39f.png">
<br>

<h1> ICA en PYTHON:</h1>
<h3>CODIGO COMPLETO EN CUADERNO ICA.ipynb
<img width="288" alt="image" src="https://user-images.githubusercontent.com/80644486/204178672-d43f4020-531b-4069-80ea-65cb040531db.png">
<img width="462" alt="image" src="https://user-images.githubusercontent.com/80644486/204178702-daae211c-0c4e-4adc-abc4-d8880f44b8c2.png">

<img width="473" alt="image" src="https://user-images.githubusercontent.com/80644486/204178648-dcf6e9ca-1079-41a6-aff9-0a449405c1d7.png">

