# lesson #1 - Сборка jar файла

JAR (Java Archive): Формат архива для хранения Java классов и мета информации.

## Этап 1: Сборка программы

Выполним сборку программы из корня проекта командой (Если вы находитесь в корне репозитория):

```sh
javac ./lessons/lesson_2/Demo.java
```

В той же директории где находится исходный файл, создастся файл Demo.class

## Этап 2: Создание манифеста

В директории с файлом Demo.class, создайте файл `Manifest.txt`
Скопируйте в него следующее содержимое:

```txt
Main-Class: Demo

```

## Этап 3: Компиляция JAR

Для сборки jar архива используется утилита [jar](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/jar.html).

Использование: jar [OPTION...] [ [--release VERSION] [-C dir] files] ...

Запустите команду (Если вы находитесь в корне репозитория):

```sh
jar -c -f ./lessons/lesson_2/Demo.jar -m ./lessons/lesson_2/Manifest.txt ./lessons/lesson_2/Demo.class
```
jar -c -f Demo.jar -m Manifest.txt Demo.class

Флаг `-c` означает compile и без него jar файл не соберется.
Флаг `-f` означает файл и указывает куда и под каким именем сохранить jar файл.
Флаг `-m` означает файл манифеста и с помощью него указывается местоположение файла манифеста.
В самом конце команды указываются пути со собранных бинарных файлов классов, в нашем случае файл `Demo.class`.

После выполнения вышеописанной команды будет сгенерирован файл `Demo.jar`

## Этап 4: Запуск jar файла

Запуск jar файла осуществляется программой java со специальным флагом.

Запустите команду:

```sh
java -jar -cp ./lessons/lesson_2 Demo.jar
```

## Видео

[How to Create JAR(Java ARchive) File using Command line](https://www.youtube.com/watch?v=RqTd-BtC2sY)
