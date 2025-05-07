#import benchmarking as Ben


import matplotlib.pyplot as plt
from metodos_ordenamiento import MetodosOrdenamiento
from benchmarking import Benchmarking
if __name__ == "__main__":
    print("Funciona")
    benchmarking = Benchmarking()
    metodos = MetodosOrdenamiento()
    
    tamanios = [500, 1000, 2000]
     
    resultados = []
    for tam in tamanios:
        array = benchmarking.build_arreglo(tam)

        metodosD = { "Burbuja" : metodos.sortByBuble,
                    "Seleccion": metodos.sort_selection }
        
    
        for nombre, metodo in metodosD.items():
            tiempo = benchmarking.medir_tiempo(metodo, array)
            tuplaRes = (tam, nombre, tiempo)
            resultados.append(tuplaRes)
        
        for resultado in resultados:
            tam, nombre, tiempo = resultado
            print(f"Tamaño: {tam}, Nombre: {nombre} , Tiempo: {tiempo}")

        

    tiempos_by_metodo = {
        "Burbuja" : [],
        "Seleccion" : []
    }

    for tam, nombre, tiempo in resultados:
        tiempos_by_metodo[nombre].append(tiempo)

    plt.figure(figsize=(10,6))
    for nombre, tiempos in tiempos_by_metodo.items():
        plt.plot(tamanios, tiempos, label=nombre, marker='o')

    plt.grid()
    plt.title("Grafico 1")
    plt.xlabel("Tamaño: x")
    plt.ylabel("Tiempo: y")

    plt.legend()
    plt.show()
    
    


    


































# Instancias