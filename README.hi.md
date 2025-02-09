# Bytedesk - चैट सेवा

टीम सहयोग के साथ AI संचालित ओमनीचैनल ग्राहक सेवा

:::tip
Bytedesk अभी भी तीव्र विकास के प्रारंभिक चरण में है, दस्तावेज़ीकरण विकास से पीछे रह सकता है, जिसके परिणामस्वरूप कार्यात्मक विवरण सॉफ्टवेयर के नवीनतम संस्करण से मेल नहीं खा सकते हैं
:::

## मुख्य विशेषताएं

### टीम मैसेजिंग

- बहु-स्तरीय संगठनात्मक संरचना
- भूमिका प्रबंधन
- अनुमति प्रबंधन
- और अधिक

### ग्राहक सेवा

- मल्टीचैनल समर्थन
- कई रूटिंग रणनीतियां और विस्तृत मूल्यांकन संकेतक
- एजेंट वर्कबेंच
- और अधिक

### ज्ञान आधार

- आंतरिक दस्तावेज़
- सहायता केंद्र
- और अधिक

### टिकट प्रबंधन

- टिकट प्रबंधन
- टिकट SLA प्रबंधन
- टिकट आंकड़े और रिपोर्ट
- और अधिक

### AI चैट

- LLM के साथ चैट
- ज्ञान आधार के साथ चैट (RAG)
- और अधिक

## Docker त्वरित प्रारंभ

### प्रोजेक्ट क्लोन करें और Docker कंटेनर शुरू करें

```bash
git clone https://github.com/Bytedesk/bytedesk.git && cd bytedesk/deploy/docker && docker compose -p bytedesk -f docker-compose.yaml up -d
```

### कंटेनर बंद करें

```bash
docker compose -p bytedesk -f docker-compose.yaml stop
```

## पूर्वावलोकन

स्थानीय पूर्वावलोकन

```bash
http://127.0.0.1:9003/dev
```

- [ऑनलाइन पूर्वावलोकन](https://www.weiyuai.cn/admin/)

## ओपन सोर्स क्लाइंट

- [डेस्कटॉप](https://github.com/Bytedesk/bytedesk-desktop)
- [मोबाइल](https://github.com/Bytedesk/bytedesk-mobile)

## लाइसेंस

- [Apache License 2.0](./LICENSE.txt) 