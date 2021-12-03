def num_unique_emails(emails: list[str]):
  actual_emails = set()
  for email in emails:
    local_name, domain_name = email.split('@')
    local_name = local_name.split('+')[0].replace('.', '')
    actual_emails.add('@'.join([local_name, domain_name]))
  return len(actual_emails)

print(num_unique_emails(["linqmafia@leet+code.com","linqmafia@code.com"]))