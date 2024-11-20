# Proyecto 2

**_Universidad Metropolitana de Caracas_**

**Curso:** Sistemas Operativos 2425-1, Sección 2

**Equipo 35:**

- Diego Hernández
- Rodolfo Marín

## Problemática

La comunidad geek ha vivido gran parte de su historia con una división clara que existe debido a la guerra que se ha montado entre los fanáticos de Star Wars y Star Trek. Esta división ha dañado una gran cantidad de amistades, por lo que ambas comunidades han decidido que es hora de acabar con esto. Han decidido que a través de una serie de simulaciones, pondrán a los personajes de ambas  series a pelear entre sí hasta determinar un ganador.

## Lineamientos generales

La idea de la simulación es recrear batallas entre los personajes de Star Wars y Star Trek, mostrando los ids de cada personaje, sus habilidades y el resultado de la batalla. Esto se llevará a cabo recreando el ciclo de vida de un proceso en un sistema con colas de prioridad, el cual estará conformado por una inteligencia artificial, los personajes de cada serie y un administrador 
1. Inteligencia Artificial (Procesador): Su función es recibir dos personajes por ronda, uno de Star Wars y Star Trek, procesar sus
características y determinar el resultado de la batalla entre ambos. Dicho resultado le toma inicialmente a la IA 10 segundos en procesar y puede ser cualquiera de los siguientes: 
a. Existe un ganador del combate: Le muestra al usuario el personaje ganador, el id del mismo se guarda en una lista de ganadores y el personaje perdedor es borrado de la simulación 
b. Ocurrió un empate en el combate: Se deben volver a colocar ambos personajes en su respectiva cola de nivel 1 para competir posteriormente. Es importante que estos respeten las colas actuales y se coloquen en la última posición, esto implica que no necesariamente van a competir entre ellos la próxima vez 
c. No puede llevarse a cabo el combate: Esto sucede cuando la IA determina que ambos personajes todavía no están listos para el combate. Para solventarlo los dos personajes serán enviados a su respectiva cola de refuerzo 
Cada combate puede finalizar en cualquiera de los 3 resultados, los cuales están determinados por las siguientes probabilidades: 
a. 40% de existir un ganador 
b. 27% de ocurrir un empate 
c. 33% de no llevarse a cabo el combate 
Para el caso en el que exista un ganador, queda al criterio de los desarrolladores determinar el procedimiento para escoger a dicho ganador. Hacer un trabajo que impresione a los directivos de las comunidades puede suponer un aumento en su salario 10% (Bono) 
El Project Manager, fanático de las series, les recomienda tomar como variables de decisión estadísticas que tienen los personajes participantes, como puntos de vida, fuerza, agilidad o habilidades especiales. 
2. Personajes (procesos): Para efectos de la simulación, sólo debe tomar en cuenta que cada personaje tiene un ID único asociado y alguno de los tres
niveles de prioridad expuestos a continuación, cada uno de estos niveles con su propia cola. 
a. Nivel 1: Prioridad alta. Si hay alguna dentro del sistema, se le debe pasar a la arena de la Inteligencia Artificial sobre los de otra prioridad. En este nivel son asignados los personajes excepcionales 
b. Nivel 2: Prioridad media. Puede pasar a la arena de la Inteligencia Artificial si no hay personajes de nivel 1 encolados. En este nivel son asignados personajes promedio 
c. Nivel 3: Prioridad baja. Puede pasar a la arena de la Inteligencia Artificial si no hay personajes de nivel 1 o nivel 2 encolados. En este nivel son asignados los personajes deficientes 
El procedimiento para determinar si un personaje es excepcional, promedio o deficiente, se hará de manera libre, tomando de referencia la calidad de los elementos que conforman al personaje. Cada elemento individual en cada personaje tiene la siguiente probabilidad de ser de calidad: 
a. Habilidades: 60% de probabilidad de ser de calidad 
b. Puntos de vida: 70% de probabilidad de ser de calidad c. Fuerza: 50% de probabilidad de ser de calidad 
d. Agilidad: 40% de probabilidad de ser de calidad 
Queda a criterio de los desarrolladores decidir de qué forma implementar estas características para determinar la calidad de los personajes. Tome en cuenta que los directivos consideran positivo que existan a la vez personajes de los 3 niveles de prioridad 
Para efectos del refuerzo, todos los personajes (sin importar su prioridad) son colocados en la cola de refuerzo de su estudio y son despachados de esta de una en una. Por cada vez que se actualicen las colas, existe un 40% de probabilidades de que el primer personaje en esta cola salga, y sea colocado en la cola de prioridad 1, caso contrario el personaje debe
colocarse de último en la cola de refuerzo para esperar nuevamente su turno. 
Por último, para evitar la inanición, cada personaje tendrá un contador inicializado en 0, que aumentará en una unidad cada vez que se complete una ronda en la inteligencia artificial. Cuando el contador llegue a 8, y si el personaje no es de prioridad 1, se reiniciará el contador y el personaje pasará al siguiente nivel de prioridad. Es decir, si el personaje era de prioridad 3, pasará a prioridad 2, y si era de prioridad 2, pasará a prioridad 1. 
3. Administrador (Sistema Operativo): Se encarga de actualizar las colas del sistema y de dictarle a la Inteligencia Artificial cuál de los siguientes personajes se deben enfrentar. 
Cada dos ciclos de revisión (cada cuatro personajes revisados o dos pares de personajes), el administrador agrega un nuevo personaje de cada serie a la cola de su nivel correspondiente. Este evento ocurre con una probabilidad del 80%. Se enfatiza que el Administrador opera cada vez que la Inteligencia Artificial acaba de terminar de revisar un combate, tras eso, el administrador realiza toda la gestión descrita respecto a las colas y finalmente le indica a la Inteligencia Artificial que puede empezar a trabajar otra vez con los nuevos personajes seleccionados 
4. Colas de prioridad: Cada empresa tendrá 4 colas de prioridad, las de nivel 1, 2 y 3, y la cola de refuerzo, existiendo un total de 8 colas en la simulación. Es necesario que el administrador realice las batallas entre personajes Star Wars y Star Trek, así que cuando escoja cuáles personajes pasarán a la arena, uno será seleccionado desde las colas de prioridad para Star Trek, y otro desde las colas de prioridad para Star Wars.

## Requerimientos funcionales

- La simulación opera de la siguiente manera: Comienza a ejecutarse y se deben crear 20 personajes para cada empresa. Una vez allí, empieza a operar el administrador para decidir los personajes que pasarán en la primera ronda, luego se inicia la inteligencia artificial para llevar a cabo la simulación, una vez terminada le devuelve el control al administrador y el ciclo continúa. 
- Se debe mostrar en pantalla en todo momento las colas que mantiene el Administrador, con los ID de los personajes, cada uno en su respectiva cola en el orden en el cual estén, junto con los datos de los personajes que se encuentren en la arena de la Inteligencia Artificial 
- Se debe mostrar a través de la interfaz lo que está haciendo en todo momento la inteligencia artificial: esperando, decidiendo o anunciado el resultado 
- Se solicita implementar un control de tiempos, para que el usuario pueda alterar la velocidad con la que trabaja la inteligencia artificial, y así observar a la simulación operar a un ritmo más rápido 
- Se pide mostrar a través de la interfaz un marcador que indique en tiempo real cuántos combates ha ganado Star Wars y cuántos de Star Trek 
