
# -*- coding: UTF-8 -*-

# 打开一个文件
# for i in range(1,100):
#     for j in range(1,i):
#         print i
#         print j
#         print '----------------------------'
#         if i%j==0 and i==j:
#             print '质数:',i
            

# for (int i = 2; i <= 100; i++) { // 质数
#             for (int k = 2; k <= i; k++) { // 除数
#                 // 排除所有在 i=k 之前 能被k整除(余数为0)的数
#                 if (i % k == 0 && i != k) {
#                     break;
#                 }
#                 // 输出所有在 i=k 且 i%k=0的数
#                 else {
#                     System.out.println(i);
#                 }
#             }
#         }
p=2
x=0
while x<100:
    result=True
    for i in range(2,p-1):
        if(p%i==0):break
    if result==True:
        print(p) #如果是质数，则打印
        x=x+1#计数+1
    p+=1#P+1
            
            
            
    
            
            