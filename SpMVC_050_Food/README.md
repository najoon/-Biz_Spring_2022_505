# 부산광역시_부산맛집정보 서비스 OpenAPI 연동
* JSON type 으로 데이터 받기

## 부산광역시_부산맛집정보 api 문제점 발견
* json type 으로 데이터를 요청하고 RestTemplate 를 사용하여 데이터를 변환  mapping 하려고 하는데, 데이터는 분명 json type 인데 mimetype 의 text/plain 으로 수신되고 있다.
* RestTemplast 은 application/json mime type  으로 데이터가 수신되어야 vo, List<VO> type 으로 자동변환, mappting 할수 있는데 text.plain 은 실제 데이터는 json 모양이지만 일반 String type 의 문자열과 같기 때문에 변환을 할수 없다/.
* javaScript 를 사용한다면 json,parse("json type 의 문자열") 함수를 사용하여 쉽게 json 객체로 변환 할수 있다 . 하지만 java 에서는 안된다.
* RestTemplate 클래스에는 수신된 데이터를 중간에 가로채서 사용자가 임의로 데이터를 변활할 수 있도록 통로를 만들어 놨다
* RestTempate.intercepter 기능을 활용하면 수신된 데이터를 임의로 조작이 가능하다.

## RestTempate 의 interceptor 설정하기
* ```ClientHttpRequestInterceptor``` 인터페이스를 implements 하여 클래스를 선언하고, interceptI() method 를 재 정의하여 강제로 APPLICATION_DSON 형태로 ContentType 을 변환하기

* ```HttpRequestIntercepterV1``` 클래스를 정의하고 ```intercept``` method 재정의 하기
* 이 방법은 가장 고전적인 POJO  방식의 코드이다
* 한개의 method 를 간단하게 정의하기 위해 굳이 새로운 클래스를 만드는 것이 왠지 낭비스러눈 생각이 든다.
### 인터페이스를 사용하여 객체 생성하기
* 인터페이스를 사용하여 객체 생성하기
* 한번만 사용하고 버릴 클래스 인스턴스 만들기
```

		ClientHttpRequestInterceptor httpIntercept
		=new ClientHttpRequestInterceptor() {
			@Override
			public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
					throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
		};
```