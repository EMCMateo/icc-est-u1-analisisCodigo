import random
import time
from metodos_ordenamiento import MetodosOrdenamiento
class Benchmarking:
    def __init__(self):
        print("Benchmarking inicializado.")
    def ejemplo (self):
        self.mOrdenamiento = MetodosOrdenamiento()

        

        array = self.build_arreglo(500)
        tarea = lambda: self.mOrdenamiento.sortByBuble(array)
        tiempoMillis= self.contar_con_current_time_milles(tarea)
        tiempoNano= self.contar_con_nano_time(tarea)
        print(f"Tiempo en milisegundos: {tiempoMillis} ms")
        print(f"Tiempo en nanosegundos: {tiempoNano} ns")

    def build_arreglo(self, size):
        array = []
        for i in range(size):
            numero = random.randint(0, 99999)
            array.append(numero)
        return array
    
    def contar_con_current_time_milles(self,tarea):
        inicio = time.time()
        tarea()
        fin = time.time()
        total = (fin - inicio)  
        return total
    
    def contar_con_nano_time(self,tarea):
        inicio = time.time_ns()
        tarea()
        fin = time.time_ns() 
        total = (fin - inicio) / 1000000000
        return total
    
    def medir_tiempo(self, tarea, array):
        inicio = time.perf_counter()
        tarea(array)
        fin = time.perf_counter()
        return fin - inicio
    # LISTA [1,2,3] - modificable
    # TUPLAS (1,2,3) - no modificable
    # DICCIONARIO { "CLAVE" , OBJETO} 

    
    