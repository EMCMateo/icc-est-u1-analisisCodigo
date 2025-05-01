class MetodosOrdenamiento:

    def sortByBuble(self, array):
        array = array.copy()
        n = len(array)
        for i in range(n):
            for j in range(i+1, n):
                if array[i] > array[j]:
                    array[i], array[j] = array[j], array[i]
        return array
    
    def sort_selection(self, array):
        array = array.copy()
        n = len(array)
        for i in range (n):
            min = i
            for j in range (i+1,n):
                if array[j] < array[min]:
                    min = j
            array[i], array[min] = array[min], array[i]
        return array                
        
    