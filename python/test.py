import requests
from bs4 import BeautifulSoup

webpage = requests.get("https://news.daum.net/digital/")
soup = BeautifulSoup(webpage.content, "html.parser")

print(soup.get_text())