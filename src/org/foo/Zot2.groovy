package org.foo;

def echoStuff(stuff) {
  echo "${stuff}"
}

def mail(recipients, subject, replyTo, from, body){
  mail \
    bcc: '', \
    body: body, \
    cc: '', \
    from: from, \
    replyTo: replyTo, \
    subject: subject, \
    to: recipients
}
