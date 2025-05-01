#import benchmarking as Ben
from metodos_ordenamiento import MetodosOrdenamiento
from benchmarking import Benchmarking
if __name__ == "__main__":
    print("Funciona")
    benchmarking = Benchmarking()
    metodos = MetodosOrdenamiento()
    
    tam = 10000
    array = benchmarking.build_arreglo(tam)

    metodosD = { "Burbuja" : metodos.sortByBuble,
                 "Seleccion": metodos.sort_selection }
    
    resultados = []
    for nombre, metodo in metodosD.items():
        tiempo = benchmarking.medir_tiempo(metodo, array)
        tuplaRes = (tam, nombre, tiempo)
        resultados.append(tuplaRes)
    
    for resultado in resultados:
        tam, nombre, tiempo = resultado
        print(f"Tamaño: {tam}, Nombre: {nombre} , Tiempo: {tiempo}")

































# Instancias