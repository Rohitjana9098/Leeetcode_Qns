import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    # Use .loc to filter the row and select specific columns simultaneously
    return students.loc[students['student_id'] == 101, ['name', 'age']]