import requests
import pprint

# 서울의 위도
lat = 37.56
# 서울의 경도
lon = 1236.97
API_KEY= 'e415007fb3c057fb9253201616078688' 
lang = 'kr'


URL = f'https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API_KEY}&lang={lang}'

data = requests.get(URL).json()
pprint.pprint(data)