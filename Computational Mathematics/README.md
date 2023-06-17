# **Лабораторная работа 1.** 
 ## Системы линейных алгебраических уравнений.
 ## **Вариант : Итерационный метод**
 + ### Метод Гаусса-Зейделя 
 
В лабораторной работе Вам предлагается реализовать один из методов, который бы позволял находить столбец неизвестных для системы линейных алгебраических уравнений. Размер системы предполагается ограниченным 20, это означает, что Вашу программу после реализации необходимо будет проверить на матрице размером 20 x20 + 20 элементов (количество неизвестных в матрице Aи столбце B). Исходя из этого условия матрицы такого размера должны иметь возможность каким-то образом попадать в Ваш численный метод. Например, ввод данных в ручном формате может быть затруднительным для 420 элементов системы с 20 неизвестными. Традиционно предлагается сделать следующие методы ввода данных в программу:

+ Пользовательский ввод;
+ Ввод данных из файла;
+ Генерация случайных матриц.
  
    Для итерационных методов(метод простой итерации и метод Гаусса-Зейделя)должно быть реализовано:
  + Точность задается пользователем;
  + Проверка диагонального преобладаниядля соответствующего метода(В случае, если диагональное преобладание в изначальной матрице отсутствует предлагается сделать перестановку строк/столбцов до тех пор, пока преобладание небудет достигнуто. В случае невозможности достижения диагонального преобладания -выводить сообщение.);
  
  + Столбец неизвестных;
  + Количество итераций, за которое было найдено решение;
  + Столбец погрешностей.
  
  Обращаю ваше внимание, что для итерационных методов в пользовательском выводе вашей программы должны быть только значения неизвестных, полученные на последней выполненной итерации, а не на всех выполненных итерациях. Аналогично со столбцом погрешностей –они должны соответствовать лишь последней итерации

# <strong> <span style="color:blue"> Лабораторная работа 2.</strong> <font size="5" > _Системы нелинейных уравнений_   
  Вам необходимо будет реализовать три численных метода. Два из них будут решать нелинейные уравнения и ещё один будет решать систему нелинейных уравнений. 
  
## Вариант:
  
Решение нелинейных уравнений:
* метод деления пополам
* метод хорд

Решение систем нелинейных уравнений
* метод простой итерации
  
В связи с тем, что для решения нелинейных уравнений вам предлагается реализовать 2 метода, имеет смысл сравнить полученный результат между друг другом. Например, решением уравнения по методу деления пополам мы получили 5,1, а методом хорд получили 4,9, тогда разница между двумя методами будет равна 0,2. Соответственно, вычисления двух методов для одного уравнения должно производиться одновременно, без уточнения у пользователя каким именно численным методом он хотел бы рассчитать уравнение.