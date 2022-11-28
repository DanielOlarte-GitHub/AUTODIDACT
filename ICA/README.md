<h1>Análisis de componentes independientes (ICA) </h1>
Supongamos que estás en una fiesta en casa y estás hablando con una chica guapa. Mientras escuchas, tus oídos están siendo bombardeados por el sonido procedente de las conversaciones que tienen lugar entre los diferentes grupos de personas de la casa y de la música que está sonando a todo volumen en el fondo. Sin embargo, nada de esto te impide concentrarte en lo que dice la chica, ya que el ser humano posee la capacidad innata de diferenciar los sonidos.

Sin embargo, si esto tuviera lugar como parte de la escena de una película, el micrófono que utilizaríamos para grabar la conversación carecería de la capacidad necesaria para diferenciar entre todos los sonidos que se producen en la habitación. Aquí es donde entra en juego el Análisis de Componentes Independientes, o ICA por sus siglas en inglés. El ICA es un método computacional para separar una señal multivariable en sus componentes subyacentes. Con el ICA, podemos extraer el componente deseado (es decir, la conversación entre usted y la chica) de la amalgama de múltiples señales.


<h4> En un nivel alto, el ICA puede desglosarse en los siguientes pasos.

1. Centrar x restando la media
2. Blanquear x
3. Elija un valor inicial aleatorio para la matriz de desmezcla w
4. Calcular el nuevo valor de w
5. Normalizar w
6. Comprobar si el algoritmo ha convergido y si no lo ha hecho, volver al paso 4
7. Tomar el producto punto de w y x para obtener las señales independientes de la fuente
