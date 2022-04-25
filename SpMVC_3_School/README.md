# JSP 코딩
# Spring Project 에서 jsp 코딩
## EL(expression lang.) tag
* controller 에 받은 데이터를 표현하는 테그
* Controller  에서
model.addAttribute("변수", 값)
형식으로 데이터를 보내면 ${변수} 와 같이 표현한다
* ${변수} 위치에 값을 rendering 하여 html 코드로 변환한다.
## jstl(Java ServerPage Standard Tag lib)
* 줄여서 taglib 라고 표현한다.
* 기존에 java 명령을 사용하여 jsp 파일에 코드를 
부착하여 사용하였는데, 그러한 방법은 디자이너와 협력을 매우 어렵게 만드는 요인
* Spring, tomcat 연동된는 프로젝트 에서는 jstl 이라는 확장된 개념의 tag 를 사용한다
* jsp 파일의 상단에 taglib 를 import 하고나면 jsp 파일의 html 코드에 불편함이 없는 다양한 연산 코드를 추가할수 있다
* 가장 만이 사용하는 taglib 는 ```core```lib 이다
```
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
```