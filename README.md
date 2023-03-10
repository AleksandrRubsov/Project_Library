
                                                         Library Books

Приложение дает возможность регистрировать читателей, выдавать им книги и освобождать книги после того, как читатель возвратил их обратно в библиотеку.

                                                   Использованные технологии
                                                       
Одной из целей проекта была его реализация именно с использованием JdbcTemplate для связывания объектов и таблиц в реляционной базе данных, чтобы понять
насколько сильно отличается и удобен такой метод от использования Hibernate или низкоуровнего Jdbc API. Помимо Jdbc Template использовались следующие технологии
и зависимости: spring-core, spring-context, spring-web, spring-mvc, servlet-api. В качестве веб-сервера и контейнера сервелетов использовался Apache Tomcat. 
Для отображения реализованной back части приложения использовался Thymeleaf для 6.0 версии Spring Framework. 
К тому же использовался Hibernate Validator для валидации ФИО читателя. В качестве СУБД использовался PostgreSQL.


                                                     Иструкция по запуску
                                                             
1. Скачайте этот репозиторий себе на компьютер.                                               
Для этого запустите git bash на вашем компьютере и используйте команду                                                                          
$ git clone https://github.com/AleksandrRubsov/Project_Library.git

2. Нажмите открыть в Intellij Idea или Eclipse

![image](https://user-images.githubusercontent.com/70627203/223421496-5f28b15b-06b2-4115-b081-34a13877d647.png)

3. Выберите нужный проект

![image](https://user-images.githubusercontent.com/70627203/223423974-6ad9c347-d917-4d23-86b9-54d0c49db21f.png)

4. Если при запуске main появится ошибка "модуль не указан", то необходимо в "use classpath of module" выбрать нужный вам модуль 

![image](https://user-images.githubusercontent.com/70627203/223425188-e554f5e1-8357-43dc-95b8-a3c94087f31c.png)

5. Необходимо выполнить подгрузку всех зависимостей приложения. Для это в файле pom.xml нажмите правой кнопкой мыши, наведите на Maven и выберите reload project.

![image](https://user-images.githubusercontent.com/70627203/223429548-b74675ab-6f4d-4b19-9457-5e809c383172.png)

6. Для полноценной работы приложения необходима база данных. Как создать и настроить Субд вы можете посмотреть вот тут - https://www.youtube.com/watch?v=5Qx3ER47HaU


6. Так как проект реализован с использованием Apache Tomcat сервера, необходимо произвести его настройку. 
  Понять как правильно настроить сервер можно посмотрев вот это видео - https://www.youtube.com/watch?v=ThBw3WBTw9Q



