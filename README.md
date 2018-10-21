# Welcome to the CloudNativeMidtermExam wiki!
## work flow
1. ผู้ใช้งานล๊อคอินเข้ามาในระบบ
2. ผู้ใช้งานทำการรอโหลดรายวิชาที่สามารถลงทะเบียนได้
2.1 ถ้าผู้ใช้งานอยู่ ปี1, 2 ระบบจะไม่แสดงวิชาที่ลงได้
2.2 ถ้าผู้ใช้งานที่อยู่ ปี 3 ลงทะเบียนครบ 2 วิชา จะไม่แสดงรายวิชาให้ลงอีก สำหรับปี 4 เมื่อลงทะเบียนครบ 1 วิชา จะไม่แสดงรายวิชาให้ลงทะเบียนแล้ว
3. ถ้ามีขึ้นตามปกติ ผู้ใช้ให้ทำการ คลิก Enroll เพื่อจองรายวิชาทันที และเมื่อมีข้อความปรากฎ จะเป็นอันลงทะเบียนเสร็จสิ้น
4. ลงทะเบียนเสร็จสิ้น ข้อมูลถูกเก็บเข้า database <br>
Database host: sl-us-south-1-portal.38.dblayer.com <br>
Database port: 61063 <br>
Database schema: compose <br>
Database username: admin <br>
Database password: AKKCYCWZHHKASZXW <br>
## Youtube link. <br>
https://youtu.be/c-WAg22UDkI <br>

# User Service
## GET /users
List all users
## GET /user/{studentId}/year
Get a year from specific user
## POST /login
Login into Registration System by <br>
username = 59130500xxx
password = reverse of username ( xxx00503195 )

***

# Subject Service
## GET /subjects
List all subjects 
## GET /subject/{studentId}
List all subjects that this student can enroll.

***

# Enroll Service
## POST /enroll
Use to enroll the subject with given studentId in body
## GET /enrolled/{studentId}
Use to list the subject that this student already enrolled
## GET /seat/{subjectId}/unavailable
Use to get unavailable seat 