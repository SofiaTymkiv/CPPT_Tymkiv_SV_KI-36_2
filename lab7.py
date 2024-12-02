# Запитуємо у користувача розмір квадрата
n_rows = int(input("Введіть розмір квадрата: "))

# Запитуємо у користувача символ для заповнення квадрата
symbol = input("Введіть символ для заповнення: ")

if len(symbol) == 0:
    print("Некорректний символ. Відсутній символ.")
    exit()
elif len(symbol) > 1:
    print("Некорректний ввід. Забагато символів.")
    exit()

symbol = symbol[0]

# Створюємо двовимірний масив для зберігання символів квадрата
arr = []
for i in range(n_rows):
    if i == n_rows // 2:
        arr.append([symbol]* n_rows)
    elif i < n_rows // 2:
        arr.append([symbol] * (2 * (i+1)))    
    else:
        arr.append([symbol] * (2 * (n_rows-i)))
        

# Заповнюємо квадрат символами
for i in range(n_rows):
    if i == n_rows // 2:
        for j in range(n_rows):
            print(arr[i][j], end = '')
    elif i < n_rows // 2:
        for j in range(i+1):
            print(arr[i][j], end = '')

        for j in range(n_rows - (2 * (i+1))):
            print(" ", end = '')

        for j in range(i+1):
            print(arr[i][j], end = '')
    else:
        for j in range(n_rows-i):
            print(arr[i][j], end = '')

        for j in range(n_rows - 2 * (n_rows-i)):
            print(" ", end = '')

        for j in range(n_rows-i):
            print(arr[i][j], end = '')
    # Додаємо новий рядок на екран
    print()