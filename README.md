## CRUD_Operations_RoomDB_Android
[Geeks for Geeks의 How to Perform CRUD Operations in Room Database in Android?](https://www.geeksforgeeks.org/how-to-perform-crud-operations-in-room-database-in-android/) 를 보고 따라서 학습한 내용입니다.

## Translate!
app의 Data는 사용자의 기기에 여러 방식으로 저장된다. SQLite tables, shared preferences와 다른 많은 방법들이 있다. 우리는 <b>Android 위에 Room DB의 data를 저장, 읽기, 업데이트, 삭제</b>하는 것을 볼 것이다. 우리는 Android의 Room DB를 사용해 CRUD operations를 수행할 것이다.<br>
*CRUD : Create, Read, Update, Delete<br>

<h4>우리는 무엇을 build할 것인가요?</h4>
Geeks for Geeks에서 이용가능한 다양한 종류의 강의들을 추가하는 간단한 App을 build할 것이다. 우리는 모든 데이터를 Room DB에 저장할 것이고 그러한 과정에서 CRUD operations을 수행할 것이다.

<h4>Room이란?</h4>
Room은 Persistence Library이다. 이때 Persistence는 "지속성, 영속성"으로 프로그램 계층의 계층화 아키텍쳐 중 Persistence layer와 유관하다. 이 Persistence layer는 데이터의 영속성을 유지하는 계층이다. 여기서 이름을 따와 DB의 영속성을 유지하는 Framework를 Persistence Framework라 한다.<br>
Room은 SQLite DB 위에 추상화 layer를 제공하는 persistence library로 더 거친 DB를 허락한다. Room의 도움으로 우리는 쉽게 DB를 만들고 CRUD operations을 할 수 있다.

<h4>Room의 구성요소들</h4>
<ul>
  <li><b>Entity : </b> Entity는 @Entity로 어노테이드된 modal class이다. 이 클래스는 우리의 열(칼럼)이 될 변수를 가지고 그 class는 우리의 table이다.</li>
  <li><b>Database : </b> 우리가 Entities라 부르는 DB entries을 저장하는 추상화된 class이다.</li>
  <li><b>DAO : </b> DAO의 풀네임은 Database access object이다. 이는 우리의 DB에 여러 연산드을 수행하기 위한 interface class이다.</li>
</ul>
