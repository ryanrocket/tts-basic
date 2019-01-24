# Getter

import os

global login_type
global return_value
global username
global password

def get():
    login_type = input("tts > ")
    if (login_type == 'teacher' or login_type == 'Teacher' or login_type == 't'):
        return_value = 1
    elif (login_type == 'student' or login_type == 'Student' or login_type == 's'):
        return_value = 2

def login():
    print("\nPlease enter your username and password:")
    username = input("Username > ")
    password = input("Password > ")
