import os

from groq import Groq

# api_key=os.environ.get("GROQ_API_KEY"),

client = Groq(
    api_key=os.environ.get("GROQ_API_KEY"),
)


chat_completion = client.chat.completions.create(
    messages=[
        {
            "role": "user",
            "content": "Creame un codigo CSS para esta etiqueta html directamente para copiar: <h1>",
        }
    ],
    model="llama3-70b-8192",
)

print(chat_completion.choices[0].message.content)
