#!/bin/bash
echo "from start server"
nohup java -jar demo.jar &> output.txt
exit