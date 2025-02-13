import requests
import pprint

# 하드코딩하는 변수는 대문자로 설정
URL = 'https://fakestoreapi.com/carts' # 요청 주소

# .get(URL) : URL 주소에 요청을 보내는 메서드
data = requests.get(URL)
# <Response [200]> 
# <>: 숨겨져 있는 객체들
# [200]: 웹의 응답 코드 -> 정상적으로 응답하였습니다.
# [404]: 웹의 응답 코드 -> 그 주소는 찾을 수 없습니다. / 알 수 없는 주소로 요청하였습니다.
print(data)

# .json(): 데이터를 JSON 형태로 변환해주는 메서드
json_data = data.json()
print(json_data)
print(type(json_data))
pprint.pprint(json_data) # .pprint(): 프리티 프린트
