# Мои вопросы и ответы

## можно как то писать программы на java и запускать их на ПК где java не установлена?

Нет, для запуска программ на Java на компьютере требуется установленная Java Virtual Machine (JVM) или Java Runtime Environment (JRE). JVM выполняет байт-код, который генерируется компилятором Java (javac).

Если Java не установлена на компьютере, то вы не сможете запустить программы на Java напрямую. В таком случае, вам необходимо установить JRE или JVM на компьютер, чтобы иметь возможность запускать Java-приложения.

Обратите внимание, что существуют инструменты, такие как GraalVM и Excelsior JET, которые позволяют компилировать Java-приложения в нативный код и создавать исполняемые файлы, которые не требуют наличия установленной JVM на целевой системе. Однако, эти инструменты требуют дополнительной настройки и имеют свои особенности.

## чем отличается JRE от JVM

Java Virtual Machine (JVM):
JVM - это виртуальная машина Java, которая является средой выполнения для байт-кода Java. Она интерпретирует и выполняет байт-код, который генерируется компилятором Java (javac). JVM работает как слой абстракции между операционной системой и Java-программами, обеспечивая переносимость и платформенную независимость кода Java. Она также управляет памятью, потоками выполнения и другими аспектами выполнения программы. Различные реализации JVM существуют для разных платформ, таких как Oracle HotSpot JVM, OpenJDK JVM, IBM J9 JVM и другие.

Java Runtime Environment (JRE):
JRE - это пакет, который содержит JVM, библиотеки классов Java (Java Class Library) и другие компоненты, необходимые для выполнения Java-приложений. JRE включает в себя JVM, чтобы предоставить среду выполнения для Java-приложений, и набор библиотек классов Java, которые предоставляют различные функциональности, такие как работа с вводом-выводом, сетевыми соединениями, графикой и т. д. JRE не включает в себя компилятор Java (javac) и другие инструменты разработки, поскольку они обычно не требуются для выполнения Java-приложений.

Таким образом, JVM - это среда выполнения, которая интерпретирует и выполняет байт-код, а JRE - это пакет, который включает в себя JVM и необходимые библиотеки для выполнения Java-приложений. JRE предоставляет окружение, необходимое для запуска Java-приложений, в то время как JVM выполняет байт-код внутри этой среды.

## JRE - это пакет, который включает в себя JVM и необходимые библиотеки для выполнения Java-приложений - но равзве при компиляции программы при помощи javac эти библиотеки не собирается в один бандл?

Действительно, при компиляции программы с использованием javac, библиотеки классов Java не собираются в один бандл вместе с байт-кодом.

javac компилирует только исходный код Java в байт-код .class файлы, представляющие отдельные классы. Эти .class файлы содержат байт-код для каждого класса, но не включают в себя весь набор библиотек классов Java.

При запуске программы с помощью команды java, JVM загружает необходимые классы из установленных библиотек классов Java (часто называемых JAR-файлами). JRE включает в себя набор этих библиотек, чтобы обеспечить выполнение Java-приложений.

Таким образом, при компиляции программы с помощью javac библиотеки классов Java не упаковываются вместе с байт-кодом в один бандл. Библиотеки классов Java загружаются во время выполнения при запуске программы с помощью JVM из установленной JRE или JDK.
