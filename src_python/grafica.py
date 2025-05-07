import matplotlib.pyplot as plt

x = [1,2,3,4,5]
y = [2,4,6,8,10]

nombre1 = "Linea1"
plt.plot(x, y, label=nombre1, color="blue")
nombre2 = "Linea2"
plt.plot(2, 6, label=nombre2, color="red")

plt.title("Grafico 1")
plt.xlabel("Datos en x")
plt.ylabel("Datos en y")

plt.legend()
plt.show()

