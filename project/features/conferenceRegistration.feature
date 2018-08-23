Feature: Conference Registration

Scenario: UnSuccessful Registration
Given User is on Conference Registration Page
When User do not enter first name
Then display 'Please fill the First Name' message

Given User is on Conference Registration Page
When User do not enter last name
Then display 'Please fill the Last Name'

Given User is on Conference Registration Page
When User do not enter email
Then display 'Please fill the Email'

Given User is on Conference Registration Page
When User enters invalid email
Then display 'Please enter valid Email Id.'

Given User is on Conference Registration Page
When User do not enter contact number
Then diplay 'Please fill the Contact No.'

Given User is on Conference Registration Page
When User enters invalid contact number
Then display 'Please enter valid Contact no.'

Given User is on Conference Registration Page
When User do not enter number of people attending
Then diplay 'Please fill the Number of people attending'

Given User is on Conference Registration Page
When User do not fill the address
Then display 'Please fill the Building & Room No'

Given User is on Conference Registration Page
When User do not fill the area name
Then display 'Please fill the Area name'

Given User is on Conference Registration Page
When User do not enter the 
Then disply 'Please select city'

Given User is on Conference Registration Page
When User do not enter state
Then display 'Please select state'

Given User is on Conference Registration Page
When user do not select membership
Then display 'Please Select MemeberShip status'

Scenario: UnSuccessful Payment Details
Given User is on Conference Registration Page
When User fill registration page and goes to payment page 
And do not enter card holder name
Then display 'Please fill the Card holder name'

Given User is on Conference Registration Page
When User fill registration page and goes to payment page 
And do not enter debit card number
Then display 'Please fill the Debit card Number'

Given User is on Conference Registration Page
When User fill registration page and goes to payment page 
And do not enter CVV
Then display 'Please fill the CVV'

Given User is on Conference Registration Page
When User fill registration page and goes to payment page 
And do not enter expiration month
Then display 'Please fill expiration month'

Given User is on Conference Registration Page
When User fill registration page and goes to payment page 
And do not enter expiration year
Then display 'Please fill the expiration year'

Scenario: Successful Registration
Given User is on Conference Registration Page
When User enters valid details
Then display Conference Registration is successful