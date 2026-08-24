import pandas as pd

def delete_duplicate_emails(person: pd.DataFrame) -> None:
    # Sort by id ascending to ensure the smallest id comes first for each email group
    person.sort_values(by='id', ascending=True, inplace=True)
    
    # Drop duplicates based on the 'email' column, keeping the first occurrence (smallest id)
    person.drop_duplicates(subset=['email'], keep='first', inplace=True)